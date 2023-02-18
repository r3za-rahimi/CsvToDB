package Service;

import Repository.PersonRepo;
import model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonService {


    PersonRepo personRepo = new PersonRepo();


    public void insert() {


        try (BufferedReader bf = new BufferedReader(new FileReader("churn.csv"));) {


            bf.lines().skip(1).map(line -> {
                String[] sts = line.split(",");
                return new Person(Long.parseLong(sts[1].equals("") ? generateId() : sts[1]), sts[2], Long.parseLong(sts[3].equals("") ? "0" : sts[3])
                        , sts[4], sts[5], Integer.parseInt(sts[6].equals("") ? "0" : sts[6]), Integer.parseInt(sts[7].equals("") ? "0" : sts[7]), Float.parseFloat(sts[9])
                        , Integer.parseInt(sts[10]), Objects.equals(sts[11], "1"), Objects.equals(sts[12], "1"), Float.parseFloat(sts[13]),
                        Objects.equals(sts[14], "1"), sts.length == 16 ? Long.parseLong(sts[15]) : 0);

            }).forEach(personRepo::add);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ;

    }

    public String generateId() {


        Random random = new Random();



        while (true) {

            long num = (long) (random.nextDouble() * 100000000);
            if (num > 10000000 && num < 99999999) {

                if (personRepo.findById(num)) {
                    System.out.println(num);
                    return String.valueOf(num);

                }
            }
        }

    }


}

package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<User> user = new ArrayList<>();

        user.add(new User("Mohini" , 2.9) );
        user.add(new User("Rashmi" , 3.7) );
        user.add(new User("Mayank" , 4.9) );
        user.add(new User("Poonam" , 5.1) );
        user.add(new User("SRK" , 3.5) );
        user.add(new User("Charlie" , 2.9) );

//        1. user.sort(null); //null means natural ordering, whereas User don't know natural ordering

        //hence, we give custom comparator
//       2.  user.sort((a,b) -> (int) (a.getAge() - b.getAge()));
        // type is double but comparator returns int, hence we will have to cast it to INT

          user.sort((a,b) ->  {
              if (a.getAge() - b.getAge() > 0 ){
                  return 1;
              }
              else if (a.getAge() - b.getAge() < 0  ){
                  return -1;
              }
              else {
                  //for equal age,we can compare name using compareTo method, it compares alphabetically
                  return a.getName().compareTo(b.getName());
              }
          });



        for(User u : user) {
            System.out.println(u.getName() + " : " + u.getAge());
        }
    }
}

package com.example;

import com.google.gson.Gson;
import java.util.*;

public class LabExample {

  /*
   * STUDENTS NEED TO CHANGE THE PATH TO POINT TO THE DATA FILE ON THEIR LAPTOPS
   */
  //  private static String dataFilePath = "/Users/jerom/Documents/GitHub/class-java/stack-lab/demo/src/main/java/com/example/socksTestData.json";

  private static String dataFilePath =
    "/Users/saket/Documents/GitHub/CLASS_JAVA-WEEK-9/demo/src/mapTestData.json";

  public static SinglyLinkedList process(SinglyLinkedList input) {
    SinglyLinkedList answer = new SinglyLinkedList();

    /*
     * STUDENTS NEED TO ADD/EDIT CODE STARTING HERE
     * 
     */
   

    }
   
    

    // This is example code that can be deleted to help you get started.
    // Here I am simply traversing the list and copying the input list to the output
    // answer list.
    // Students code needs to do something different.
    LinkedListNode curr = (LinkedListNode)input.head;
    while (curr != null) {
      SinglyLinkedList answer;
      answer.insert(curr.turnRight, curr.street, curr.distance);
      curr = curr.next;

    }

    /*
     * STUDENTS DO NOT NEED TO EDIT ANY CODE AFTER THIS
     */

    System.out.println(answer);
    return answer;
  }

  public static void main(String[] args) {
    LabTestData td = new LabTestData();

    // read data
    String jsonStr = td.readJSON(dataFilePath);

    // convert data to obj
    Gson gson = new Gson();
    LabTestData testData = gson.fromJson(jsonStr, LabTestData.class);

    // run each test
    for (int i = 0; i < testData.tests.length; i += 1) {
      SinglyLinkedList input = testData.tests[i].input;
      SinglyLinkedList answer = process(input);
      SinglyLinkedList correctAnswer = testData.tests[i].output;

      System.out.printf("--------------------------------------\n");

      // if answer is correct, report results
      if (answer.equals(correctAnswer)) {
        System.out.printf("PASSED test %d :\n", i);
        // if answer is incorrect, report the error
      } else {
        System.out.printf("FAILED test %d\n", i);
      }

      System.out.printf("\ninput:\n");
      input.print();
      System.out.printf("\noutput:\n");
      answer.print();

      System.out.printf("--------------------------------------\n\n");
    }
  }
}

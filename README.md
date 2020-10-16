# Parameterized Testing using Java and JUnit5
Code sample for parameterized test using JUnit5 and Java.

![Screen Shot 2020-10-16 at 4 45 35 PM](https://user-images.githubusercontent.com/36932896/96310056-3e420500-100f-11eb-9771-8fd745d79580.png)

In this project, I am aimed to write some tests for the below method. It is a simple method which checks number and return whether it is **POSITIVE, NEGATIVE, ZERO**
```
    public String checkNumber(int input) {
        if (input > 0) {
            return "POSITIVE";
        } else if (input < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
```

In this method, I have to test 3 scenarios in which input is changed from positive integer to negative integer. As a result, I have implemented 2 different test classes which are for *non-parameterized* and *parameterized* testing.

There are various ways to supply inputs in parameterized testing. In this project, I covered the following ones:
  - Value Source
  - CSV Source
  - Method Source

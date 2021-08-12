package OfficeHoura_11Constructor.constructor;

public class Student {

    /*
    Class Name: Student

			instance variables:
					name, age, batchNumber

			static variables :
					school

			1st constructor: initializes the name ONLY

			2nd constructor: initializes name & age
						(MUST use constructor call to set the name)

			3rd Constructor: initializes name, age ,batchNumber
						(MUST use constructor call to set the name & age)


			instance methods: toString()
     */

        public String name;
        public int age, batchNumber;
        public static String schoolName;

        public Student(String name) {
            this.name = name;
        }

        public Student(String name, int age) {
            // this.name = name;
            this(name);
            this.age = age;
        }

        public Student(String name, int age, int batchNumber) {
            // this.name = name;
            //  this.age = age;
            this(name, age);
            this.batchNumber = batchNumber;
        }


        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", batchNumber=" + batchNumber +
                    '}';
        }
    }



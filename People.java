package read.git;

import java.io.Serializable;

/**
 * Created by 1 on 15.02.2017.
 */
public class People implements Serializable {

        Object People = new Object();
        public People() {

        }
        private String name;
        private Integer age;
        private Double salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }

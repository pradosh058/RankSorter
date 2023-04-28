import java.util.*;

public class Pqobject {
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s1){
            return this.rank-s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Amiya", 45));
        pq.add(new Student("Utkal", 10));
        pq.add(new Student("Tanmay", 76));
        pq.add(new Student("Sunil", 80));
        pq.add(new Student("Akash", 60));
        pq.add(new Student("Tulsi", 100));
        pq.add(new Student("Talas", 20));
        pq.add(new Student("Sandeep", 15));
        pq.add(new Student("Bikash", 110));
        while(!pq.isEmpty()){
            System.out.println("STUDENT NAME= "+pq.peek().name+"And the RANK IS ="+pq.peek().rank);
            pq.remove();
        }

    }
}

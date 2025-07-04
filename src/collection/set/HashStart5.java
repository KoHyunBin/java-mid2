package collection.set;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {

        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; //배열의 공간을 만듬
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>(); // 배열 인덱스 안에 연결리스트 생성
        }
        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복
        System.out.println("buckets = " + Arrays.toString(buckets));


        //검색
        int searchIndex = 9;
        boolean contains = contains(buckets, searchIndex);
        System.out.println("buckets.contains(" + searchIndex + ") = " + contains);

    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if(!bucket.contains(value)) { //O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //O(n)
    }


    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

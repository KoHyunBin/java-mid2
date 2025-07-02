package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();


        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냐옹이", 300);


        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1 개 병원에 고양이 전달
        //dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류

        //문제2 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

// 정리 제네릭에 타입 매개변수 상한을 사용해서 타입 안정성을 지키면서 상위 타입의
// 원하는 기능까지 사용할 수 있었다 덕분에 코드 재사용과 타입 안정성이라는 두 마리 토끼를 잡을 수 있었다.


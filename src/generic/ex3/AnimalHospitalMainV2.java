package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {

        // 제네릭 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다
        // 따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 Object로 가정하고 Object의 기능만 사용할 수 있다
        // 만약 타입 인자가 모두 Animal과 그 자식만 들어올 수 있게 제한하다면 어떨까
        AnimalHospitalV2<Dog> dogAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectAnimalHospitalV2 = new AnimalHospitalV2<>();
    }
}

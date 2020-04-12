package org.tasmanijskidjavo.strategy;

public class Main {

    public static void main(String[] args) {
        TestDto testDto = new TestDto();
        testDto.setName("Srdjan");
        testDto.setAge(22);
        testDto.setLastName("Bocanji");
        ObjectSerializer objectSerializer = new ObjectSerializer();
        objectSerializer.setPropertySerializationStrategy(new SnakeCaseStrategyImpl());
        try {
            System.out.println(objectSerializer.serialize(testDto));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package Handson;

import java.util.Optional;

public class OptionalEmptyEx {
    public static void main(String[] args) {
        Optional op=Optional.of(" ");
        op=op.empty();
        System.out.println(op.isEmpty());
    }
}

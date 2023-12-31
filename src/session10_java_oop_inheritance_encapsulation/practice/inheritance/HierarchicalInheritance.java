package session10_java_oop_inheritance_encapsulation.practice.inheritance;

public class HierarchicalInheritance {
}

class Lioness {
    void roar() {
        System.out.println("The lioness roars loudly.");
    }
}

class Cub1 extends Lioness {
    @Override
    void roar() {
        System.out.println("The cub roars softly.");
    }
}

class Cub2 extends Lioness {
    @Override
    void roar() {
        System.out.println("The cub roars softly.");
    }
}

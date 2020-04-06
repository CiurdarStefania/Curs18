package ro.fasttrackit.mvnbase.curs18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecursiveTest {
    Recursiv recursiv;
    @BeforeEach
    void setup() {
        recursiv = new Recursiv();
    }
    @Test
    @DisplayName("null is recursiv THEN throw IlegalArgumentException ")
    void nullThatException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> recursiv.length(null));
    }
}

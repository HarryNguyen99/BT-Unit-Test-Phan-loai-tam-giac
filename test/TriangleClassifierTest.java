import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void TriangLe (){
        boolean triangleCheck = TriangleClassifier.triangLe(8,2,3);
        boolean expected = true;
        assertEquals(expected, triangleCheck);
    }

    @Test
    void TriangleThuong() {
        boolean triangleCheck = TriangleClassifier.triangLeThuong(3,4,5);
        boolean expected = true;
        assertEquals(expected, triangleCheck);
    }

    @Test
    void TriangleCan() {
        boolean triangleCheck = TriangleClassifier.triangLeCan(2,2,3);
        boolean expected = true;
        assertEquals(expected, triangleCheck);
    }

    @Test
    void TriangleDeu() {
        boolean triangleCheck = TriangleClassifier.triangLeDeu(2,2,2);
        boolean expected = true;
        assertEquals(expected, triangleCheck);
    }

}

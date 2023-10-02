package com.thealgorithms.misc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MirrorOfMatrixTest {
    private MirrorOfMatrix MirrorOfMatrix;

    @BeforeEach
    void setUp() {
        MirrorOfMatrix = new MirrorOfMatrix();
    }

    @Test
    void testMirrorMatrixRegularMatrix() {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expectedMirrorMatrix = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        int[][] mirroredMatrix = MirrorOfMatrix.mirrorMatrix(originalMatrix);
        assertArrayEquals(expectedMirrorMatrix, mirroredMatrix);
    }

    @Test
    void testMirrorMatrixEmptyMatrix() {
        int[][] originalMatrix = {};
        int[][] expectedMirrorMatrix = {};
        int[][] mirroredMatrix = MirrorOfMatrix.mirrorMatrix(originalMatrix);
        assertArrayEquals(expectedMirrorMatrix, mirroredMatrix);
    }

    @Test
    void testMirrorMatrixSingleElementMatrix() {
        int[][] originalMatrix = {{42}};
        int[][] expectedMirrorMatrix = {{42}};
        int[][] mirroredMatrix = MirrorOfMatrix.mirrorMatrix(originalMatrix);
        assertArrayEquals(expectedMirrorMatrix, mirroredMatrix);
    }

    @Test
    void testMirrorMatrixOneRowMultipleColumnsMatrix() {
        int[][] originalMatrix = {{1, 2, 3, 4}};
        int[][] expectedMirrorMatrix = {{4, 3, 2, 1}};
        int[][] mirroredMatrix = MirrorOfMatrix.mirrorMatrix(originalMatrix);
        assertArrayEquals(expectedMirrorMatrix, mirroredMatrix);
    }

    @Test
    void testMirrorMatrixMultipleRowsOneColumnMatrix() {
        int[][] originalMatrix = {
                {1},
                {2},
                {3},
                {4}
        };
        int[][] expectedMirrorMatrix = {
                {1},
                {2},
                {3},
                {4}
        };
        int[][] mirroredMatrix = MirrorOfMatrix.mirrorMatrix(originalMatrix);
        assertArrayEquals(expectedMirrorMatrix, mirroredMatrix);
    }

    @Test
    void testMirrorMatrixNullInput() {
        int[][] originalMatrix = null;
        assertNull(MirrorOfMatrix.mirrorMatrix(originalMatrix));
    }
}

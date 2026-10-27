package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PenilaianMahasiswaTest {
    
    PenilaianMahasiswa penilaian = new PenilaianMahasiswa();

    // --- TEST CASE ASLI ---
    @Test
    public void testNilaiA() {
        assertEquals("A", penilaian.hitungNilai(90));
        assertEquals("A", penilaian.hitungNilai(85));
    }

    @Test
    public void testNilaiB() {
        assertEquals("B", penilaian.hitungNilai(80));
        assertEquals("B", penilaian.hitungNilai(70));
    }

    @Test
    public void testNilaiC() {
        assertEquals("C", penilaian.hitungNilai(60));
        assertEquals("C", penilaian.hitungNilai(55));
    }

    @Test
    public void testNilaiD() {
        assertEquals("D", penilaian.hitungNilai(50));
        assertEquals("D", penilaian.hitungNilai(40));
    }

    @Test
    public void testNilaiTidakValid() {
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(110));
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(-10));
    }

    // --- TEST CASE TAMBAHAN (1 per 1 sesuai 13 ID Excel Tugas Rumah) ---

    @Test
    public void testTcHW001() {
        // TC-HW-001: nilai = -1
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(-1));
    }

    @Test
    public void testTcHW002() {
        // TC-HW-002: nilai = 0
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(0));
    }

    @Test
    public void testTcHW003() {
        // TC-HW-003: nilai = 39
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(39));
    }

    @Test
    public void testTcHW004() {
        // TC-HW-004: nilai = 41
        assertEquals("D", penilaian.hitungNilai(41));
    }

    @Test
    public void testTcHW005() {
        // TC-HW-005: nilai = 54
        assertEquals("D", penilaian.hitungNilai(54));
    }

    @Test
    public void testTcHW006() {
        // TC-HW-006: nilai = 56
        assertEquals("C", penilaian.hitungNilai(56));
    }

    @Test
    public void testTcHW007() {
        // TC-HW-007: nilai = 69
        assertEquals("C", penilaian.hitungNilai(69));
    }

    @Test
    public void testTcHW008() {
        // TC-HW-008: nilai = 71
        assertEquals("B", penilaian.hitungNilai(71));
    }

    @Test
    public void testTcHW009() {
        // TC-HW-009: nilai = 84
        assertEquals("B", penilaian.hitungNilai(84));
    }

    @Test
    public void testTcHW010() {
        // TC-HW-010: nilai = 86
        assertEquals("A", penilaian.hitungNilai(86));
    }

    @Test
    public void testTcHW011() {
        // TC-HW-011: nilai = 99
        assertEquals("A", penilaian.hitungNilai(99));
    }

    @Test
    public void testTcHW012() {
        // TC-HW-012: nilai = 100
        assertEquals("A", penilaian.hitungNilai(100));
    }

    @Test
    public void testTcHW013() {
        // TC-HW-013: nilai = 101
        assertEquals("Nilai tidak valid", penilaian.hitungNilai(101));
    }
}
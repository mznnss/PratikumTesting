<div align="center">

# 🧪 Automated Unit Testing: PenilaianMahasiswa
### Software Testing & Quality Assurance Portfolio

[![Java](https://img.shields.io/badge/Java-JDK%2021%2B-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)
[![JUnit 4](https://img.shields.io/badge/Testing-JUnit%204.13.2-25A162?style=for-the-badge&logo=junit5)](https://junit.org/junit4/)
[![Status](https://img.shields.io/badge/Build-Passing-success?style=for-the-badge)]()

*Implementasi pengujian perangkat lunak otomatis menggunakan JUnit 4 dan Apache Maven dengan pendekatan Boundary Value Analysis (BVA).*

</div>

---

## 📌 Tentang Proyek
Repositori ini dikembangkan untuk memenuhi tugas praktikum pengujian perangkat lunak. Fokus utama proyek ini adalah menguji ketahanan logika percabangan (*branching logic*) pada kelas `PenilaianMahasiswa.java` menggunakan teknik **Boundary Value Analysis (BVA)** untuk memastikan validitas rentang nilai akademik mahasiswa secara presisi.

---

## 🛠️ Tech Stack & Tools
- **Bahasa Pemrograman:** Java (JDK 21+)
- **Build Automation:** Apache Maven
- **Testing Framework:** JUnit 4 (`v4.13.2`)
- **Environment:** Visual Studio Code / Windows

---

## 📂 Struktur Direktori Proyek
```text
PratikumTesting/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── PenilaianMahasiswa.java     # Core business logic
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── PenilaianMahasiswaTest.java # Unit testing suite (13+ test cases)
└── pom.xml                                         # Maven dependency configuration

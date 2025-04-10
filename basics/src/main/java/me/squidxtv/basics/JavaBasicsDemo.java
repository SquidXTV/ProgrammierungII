package me.squidxtv.basics;

/***
 * Java Basics Demonstration Class
 *
 * Static methods for running demo cases for
 *  - Primitive Types
 *  - Type Inference
 *  - Operators
 *  - Control Structures
 */
public class JavaBasicsDemo {

    public static void demonstratePrimitiveTypes() {
        System.out.println("=== Primitive Datentypen ===");

        // Boolean - 1 bit (true oder false)
        boolean istWahr = true;
        System.out.println("boolean istWahr = " + istWahr);

        // Char - 16 bits (Unicode Zeichen)
        char buchstabe = 'A';
        System.out.println("char buchstabe = " + buchstabe);

        // Byte - 8 bits (-128 bis 127)
        byte kleinsteZahl = 0b00000010;
        System.out.println("byte kleinsteZahl = " + kleinsteZahl);

        // Short - 16 bits (-32,768 bis 32,767)
        short kleineZahl = 32767;
        System.out.println("short kleineZahl = " + kleineZahl);

        // Int - 32 bits (-2^31 bis 2^31-1)
        int ganzeZahl = 2147483647;
        System.out.println("int ganzeZahl = " + ganzeZahl);

        // Long - 64 bits (-2^63 bis 2^63-1)
        long großeZahl = 922_3372_0368_5477_5807L; // Beachte das 'L' am Ende
        System.out.println("long großeZahl = " + großeZahl);

        // Float - 32 bits (Gleitkommazahl mit einfacher Genauigkeit)
        float kommaZahl = 3.14159f; // Beachte das 'f' am Ende
        System.out.println("float kommaZahl = " + kommaZahl);

        // Double - 64 bits (Gleitkommazahl mit doppelter Genauigkeit)
        double präziseKommaZahl = 3.141592653589793;
        System.out.println("double präziseKommaZahl = " + präziseKommaZahl);

        System.out.println();
    }

    public static void demonstrateTypeInference() {
        System.out.println("=== Typinferenz (var) ===");

        // var wurde in Java 10 eingeführt
        var text = "Hallo Welt!!!"; // Der Compiler erkennt, dass es ein String ist
        var nummer = 42; // Der Compiler erkennt, dass es ein int ist
        var pi = 3.14159888; // Der Compiler erkennt, dass es ein double ist

        System.out.println("var text = " + text + " (Typ: " + text.getClass().getSimpleName() + ")");
        System.out.println("var nummer = " + nummer + " (Typ: Integer)");
        System.out.println("var pi = " + pi + " (Typ: Double)");

        System.out.println();
    }

    public static void demonstrateOperators() {
        System.out.println("=== Operatoren ===");

        // Arithmetische Operatoren
        System.out.println("Arithmetische Operatoren:");
        int a = 10;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraktion
        System.out.println("a * b = " + (a * b)); // Multiplikation
        System.out.println("a / b = " + (a / b)); // Division (ganzzahlig)
        System.out.println("a % b = " + (a % b)); // Modulo (Rest)

        // Relationale Operatoren
        System.out.println("\nRelationale Operatoren:");
        System.out.println("a == b: " + (a == b)); // Gleichheit
        System.out.println("a != b: " + (a != b)); // Ungleichheit
        System.out.println("a > b: " + (a > b)); // Größer als
        System.out.println("a < b: " + (a < b)); // Kleiner als
        System.out.println("a >= b: " + (a >= b)); // Größer oder gleich
        System.out.println("a <= b: " + (a <= b)); // Kleiner oder gleich

        // Logische Operatoren
        System.out.println("\nLogische Operatoren:");
        boolean x = true;
        boolean y = false;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y: " + (x && y)); // Logisches UND
        System.out.println("x || y: " + (x || y)); // Logisches ODER
        System.out.println("!x: " + (!x)); // Logisches NICHT

        // Bit-Operatoren
        System.out.println("\nBit-Operatoren:");
        int c = 5;  // 101 in Binär
        int d = 3;  // 011 in Binär
        System.out.println("c = " + c + " (binär: " + Integer.toBinaryString(c) + ")");
        System.out.println("d = " + d + " (binär: " + Integer.toBinaryString(d) + ")");
        System.out.println("c & d = " + (c & d) + " (binär: " + Integer.toBinaryString(c & d) + ")"); // Bitweises UND
        System.out.println("c | d = " + (c | d) + " (binär: " + Integer.toBinaryString(c | d) + ")"); // Bitweises ODER
        System.out.println("c ^ d = " + (c ^ d) + " (binär: " + Integer.toBinaryString(c ^ d) + ")"); // Bitweises XOR
        System.out.println("~c = " + (~c) + " (binär: " + Integer.toBinaryString(~c).substring(32 - 8) + ")"); // Bitweise Negation
        System.out.println("c << 1 = " + (c << 1) + " (binär: " + Integer.toBinaryString(c << 1) + ")"); // Linksverschiebung
        System.out.println("c >> 1 = " + (c >> 1) + " (binär: " + Integer.toBinaryString(c >> 1) + ")"); // Rechtsverschiebung
        System.out.println("c >>> 1 = " + (c >>> 1) + " (binär: " + Integer.toBinaryString(c >>> 1) + ")"); // Vorzeichenlose Rechtsverschiebung

        // Zuweisungsoperatoren
        System.out.println("\nZuweisungsoperatoren:");
        int e = 10;
        System.out.println("Ausgangswert e = " + e);
        System.out.println("e += 5 -> e = " + (e += 5)); // Additionszuweisung
        System.out.println("e -= 2 -> e = " + (e -= 2)); // Subtraktionszuweisung
        System.out.println("e *= 2 -> e = " + (e *= 2)); // Multiplikationszuweisung
        System.out.println("e /= 4 -> e = " + (e /= 4)); // Divisionszuweisung
        System.out.println("e %= 3 -> e = " + (e %= 3)); // Modulozuweisung
        e = 5;
        System.out.println("Neuer Wert e = " + e);
        System.out.println("e &= 3 -> e = " + (e &= 3)); // Bitweise UND-Zuweisung
        System.out.println("e |= 8 -> e = " + (e |= 8)); // Bitweise ODER-Zuweisung
        System.out.println("e ^= 5 -> e = " + (e ^= 5)); // Bitweise XOR-Zuweisung
        System.out.println("e <<= 2 -> e = " + (e <<= 2)); // Linksverschiebungszuweisung
        System.out.println("e >>= 1 -> e = " + (e >>= 1)); // Rechtsverschiebungszuweisung

        // Inkrementieren und Dekrementieren
        System.out.println("\nInkrementieren und Dekrementieren:");
        int f = 5;
        System.out.println("f = " + f);
        System.out.println("++f = " + (++f)); // Präfix-Inkrement
        System.out.println("f++ = " + (f++)); // Postfix-Inkrement
        System.out.println("Nach f++: f = " + f);
        System.out.println("--f = " + (--f)); // Präfix-Dekrement
        System.out.println("f-- = " + (f--)); // Postfix-Dekrement
        System.out.println("Nach f--: f = " + f);

        // Bedingungsoperator (Ternärer Operator)
        System.out.println("\nBedingungsoperator (Ternärer Operator):");
        int alter = 18;
        String status = (alter >= 18) ? "volljährig" : "minderjährig";
        System.out.println("Mit " + alter + " Jahren ist man " + status);

        // Typumwandlung (Casting)
        System.out.println("\nTypumwandlung (Casting):");
        double kommaZahl = 9.99;
        int ganzeZahl = (int) kommaZahl; // Explizites Casting von double zu int
        System.out.println("double kommaZahl = " + kommaZahl);
        System.out.println("int ganzeZahl = (int) kommaZahl = " + ganzeZahl);

        long großeGanzeZahl = 1234567890L;
        int kleinereGanzeZahl = (int) großeGanzeZahl;
        System.out.println("long großeGanzeZahl = " + großeGanzeZahl);
        System.out.println("int kleinereGanzeZahl = (int) großeGanzeZahl = " + kleinereGanzeZahl);

        // Automatisches Casting (implizite Typumwandlung)
        byte kleineByte = 100;
        int größereZahl = kleineByte; // Automatisches Casting von byte zu int
        System.out.println("byte kleineByte = " + kleineByte);
        System.out.println("int größereZahl = kleineByte = " + größereZahl + " (implizites Casting)");

        System.out.println();
    }

    public static void demonstrateControlStructures() {
        System.out.println("=== Kontrollstrukturen ===");

        // if-else Anweisung
        System.out.println("\nif-else Anweisung:");
        int zahl = 15;

        if (zahl > 0) {
            System.out.println("Die Zahl " + zahl + " ist positiv.");
        } else if (zahl < 0) {
            System.out.println("Die Zahl " + zahl + " ist negativ.");
        } else {
            System.out.println("Die Zahl ist null.");
        }

        // switch Anweisung
        System.out.println("\nswitch Anweisung:");
        int tag = 3;
        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
            case 7:
                System.out.println("Wochenende");
                break;
            default:
                System.out.println("Ungültiger Tag");
        }

        // while Schleife
        System.out.println("\nwhile Schleife:");
        int count = 1;
        while (count <= 5) {
            System.out.println("while-Schleife Iteration: " + count);
            count++;
        }

        // do-while Schleife
        System.out.println("\ndo-while Schleife:");
        count = 1;
        do {
            System.out.println("do-while-Schleife Iteration: " + count);
            count++;
        } while (count <= 5);

        // for Schleife
        System.out.println("\nfor Schleife:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("for-Schleife Iteration: " + i);
        }

        // foreach Schleife (for-each)
        System.out.println("\nforeach Schleife (for-each):");
        String[] früchte = {"Apfel", "Banane", "Orange", "Mango", "Kirsche"};
        for (String frucht : früchte) {
            System.out.println("Frucht: " + frucht);
        }

        // break und continue
        System.out.println("\nbreak und continue Demonstration:");

        // break Beispiel
        System.out.println("break Beispiel:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("break bei i = " + i);
                break; // Beendet die Schleife, wenn i gleich 6 ist
            }
            System.out.println("Iteration: " + i);
        }

        // continue Beispiel
        System.out.println("\ncontinue Beispiel:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Wenn i gerade ist
                continue; // Überspringt den Rest der Schleife für gerade Zahlen
            }
            System.out.println("Ungerade Zahl: " + i);
        }

        // Verschachtelte Schleifen mit break/continue
        System.out.println("\nVerschachtelte Schleifen mit break/continue:");
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Break aus beiden Schleifen bei i=" + i + ", j=" + j);
                    break outerLoop; // Beendet die äußere Schleife mit Label
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
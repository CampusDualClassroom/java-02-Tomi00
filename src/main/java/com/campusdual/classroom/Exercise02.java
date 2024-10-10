package com.campusdual.classroom;

public class Exercise02 {

    public static void main(String[] args) {
        double r = 15;
        double a, l;

        // TODO: ↓ Fórmula del área de un círculoS: a = radio * radio * Número PI
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("Area: " + area);

        // TODO: ↓ Fórmula de la longitud de una circunferencia: l = 2 * radio * Número PI
        double longitud = 2 * Math.PI * r;
        System.out.println("Longitud:  " + longitud);

    }
}

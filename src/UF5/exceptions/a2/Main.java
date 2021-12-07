package UF5.exceptions.a2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompteEstalvi compteEstalvi = new CompteEstalvi("CuentaDeXiao");
        Client client;
        System.out.print("Dame tu nombre: ");
        String nom = sc.nextLine();
        System.out.print("Dame tu apellido: ");
        String cognom = sc.nextLine();
        System.out.print("Dame tu Dni: ");
        String dni = sc.nextLine();
        client = new Client();

        // Si el DNI es valido, metera en la cuenta.
        try {
            if (client.validarDNI(dni)){
                client.setNom(nom);
                client.setCognoms(cognom);
                client.setDNI(dni);
                compteEstalvi.addUser(client);
            }
        } catch (ClientAccountException e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println();
        System.out.print("Cuanto dinero quieres sacar: ");
        int dinero = sc.nextInt();
        sc.nextLine();
        // Si no tienes dinero salta el error
        try {
            compteEstalvi.treure(dinero);
            System.out.println("Tu dinero actual es: " + compteEstalvi.getSaldo() + "€");
        } catch (BankAccountException e) {
            e.printStackTrace();
        }

        System.out.println("Tu cuenta hay " + compteEstalvi.getLlista_usuaris().size() + " usuarios");
        // borrar usuarios, pero como solo hay uno no borra.
        try {
            compteEstalvi.removeUser(client.getDNI());
        } catch (BankAccountException e) {
            e.printStackTrace();
        }
    }
}

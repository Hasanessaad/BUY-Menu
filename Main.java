import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        List<Client> clients = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        Scanner myInput = new Scanner(System.in);
        String Username;

        int option, option2;
        boolean exit = false;

        do {
            System.out.println("]-HABIBI SHOP-[");
            System.out.println("");
            System.out.println("=== se vc nao tem cliente cadastrado vc nao pode acessar pedidos !!!!!!!!!!!!!!!! ===");
            System.out.println("");
            System.out.println("1-Register a client");
            System.out.println("2-Place an order");
            int selecting = myInput.nextInt();

            if (selecting == 1) {
                System.out.println("1-Cadastrar");
                System.out.println("2-Listar");
                System.out.println("3-Search");
                System.out.println("4-Fullfilled orders");
                System.out.println("4-Sair");
                option = myInput.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("}-CADASTRAR-{");
                        System.out.println("name: ");
                        myInput.nextLine();
                        String name = myInput.nextLine();
                        System.out.println("AGE: ");
                        int age = myInput.nextInt();

                        System.out.println("how many addresses do you wish to have : ");
                        int x = myInput.nextInt();
                        List<Address> addresses = new ArrayList<>();
                        for (int i = 0; i < x; i++) {
                            System.out.println("Address: ");
                            myInput.nextLine();
                            String street = myInput.nextLine();
                            System.out.println("street number: ");
                            int numb = myInput.nextInt();
                            addresses.add(new Address(street, numb));
                        }
                        clients.add(new Client(name, age, addresses , orders));
                        break;
                    case 2:
                        System.out.println("}-LISTAR-{");
                        for (Client client : clients) {
                            System.out.println("Nome: " + client.getName());
                            System.out.println("Idade: " + client.getAge());

                            List<Address> addresses1 = client.getAddresses();
                            for (int i = 0; i < addresses1.size(); i++) {
                                Address addresses2 = addresses1.get(i);
                                System.out.println("Endereço: " + (i + 1) + ":");
                                System.out.println("  Rua: " + addresses2.getStreet());
                                System.out.println("  Número: " + addresses2.getNumb());
                            }
                            System.out.println("+------------------------------------------------------+");
                            System.out.println("+------------------------------------------------------+");
                        }
                        break;
                    case 3:
                        System.out.print("Enter the name to search for: ");
                        myInput.nextLine();
                        String searchName = myInput.nextLine();
                        boolean found = false;

                        for (Client client : clients) {
                            if (client.getName().equalsIgnoreCase(searchName)) {
                                System.out.println("}-CLIENTE ENCONTRADO-{");
                                System.out.println("Nome: " + client.getName());
                                System.out.println("Idade: " + client.getAge());

                                List<Address> addresses1 = client.getAddresses();
                                for (int i = 0; i < addresses1.size(); i++) {
                                    Address addresses2 = addresses1.get(i);
                                    System.out.println("Endereço " + (i + 1) + ":");
                                    System.out.println("  Rua: " + addresses2.getStreet());
                                    System.out.println("  Número: " + addresses2.getNumb());
                                }
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println("Do you wish to edit " + searchName + " INFO?");
                                System.out.println("input (1) for YES and (2) for NO");
                                int cho = myInput.nextInt();

                                if (cho == 1) {
                                    System.out.print("Indicate the new name: ");
                                    myInput.next();
                                    String newName = myInput.nextLine();

                                    List<Address> newAddresses = new ArrayList<>();
                                    System.out.print("how many addresses do you wish to add?");
                                    int numAddresses = Integer.parseInt(myInput.nextLine());

                                    for (int i = 1; i <= numAddresses; i++) {
                                        System.out.print("Digite a rua do endereço " + i + ": ");
                                        myInput.nextLine();
                                        String street = myInput.nextLine();
                                        System.out.print("Digite o número do endereço " + i + ": ");
                                        myInput.nextInt();
                                        int numb = myInput.nextInt();
                                        Address newAddress = new Address(street, numb);
                                        newAddresses.add(newAddress);
                                    }

                                    // Update client information
                                    client.setName(newName);
                                    client.setAddresses(newAddresses);

                                    System.out.println("}-CLIENTE EDITADO-{");
                                    System.out.println("Novo nome: " + client.getName());
                                    List<Address> updatedAddresses = client.getAddresses();
                                    for (int i = 0; i < updatedAddresses.size(); i++) {
                                        Address updatedAddress = updatedAddresses.get(i);
                                        System.out.println("Endereço " + (i + 1) + ":");
                                        System.out.println("  Rua: " + updatedAddress.getStreet());
                                        System.out.println("  Número: " + updatedAddress.getNumb());
                                    }
                                } else {
                                    System.out.println("NO CHANGES HAS BEEN DONE!!");
                                }

                                found = true;
                                break;

                            }
                        }

                        if (!found) {
                            System.out.println("}-CLIENTE NÃO ENCONTRADO-{");
                        }
                        break;
                    case 4:
                        System.out.printf("Closing system...");
                        exit = true;
                        break;
                    default:
                        System.out.printf("Error");
                        break;
                }
            }
            if (selecting == 2) {

                System.out.println("------------------------------------------------------------------------");
                System.out.println("------------------------------------------------------------------------");
                System.out.println("]-PLACE AN ORDER-[");
                int koko = 0;
                while (koko == 0) {
                    System.out.println("indicate your login name:");
                    myInput.nextLine();
                    String searchName1 = myInput.nextLine();
                    Username = searchName1;
                    for (Client client : clients) {
                        if (client.getName().equalsIgnoreCase(searchName1)) {
                            System.out.println("}-CLIENTE ENCONTRADO-{");
                            System.out.println("Bem Vindo: " + client.getName());
                            System.out.println("Idade: " + client.getAge());
                            koko = 1;
                        } else {
                            System.out.println("}-CLIENTE NÃO ENCONTRADO TENTA NOVAMENTE-{");
                        }
                    }

                }

                System.out.println("1-Orders");
                System.out.println("2-Carrinho");
                System.out.println("3-Orders on the way");

                option2 = myInput.nextInt();
                switch (option2) {
                    case 1:
                        int lol = 0;
                        while (lol == 0) {

                            int choice;
                            System.out.println("CHOOSE YOUR PRODUCT");
                            System.out.println("1-CELLPHONE");
                            choice = myInput.nextInt();
                            if (choice == 1) {
                                System.out.println("the cost of the PHONE is = 500$");
                                System.out.println("indicate the quantity: ");
                                int quant = myInput.nextInt();
                                if (quant > 0) {
                                    int totalpriceofcell = quant * 500;
                                    String nameprod = "CELLPHONE";
                                    orders.add(new Order(quant, totalpriceofcell , nameprod));
                                    for (Order orders1 : orders) {
                                        System.out.println("the total price for "+orders1.getNameprod()+" order = " + orders1.getTotalpriceofcell() + "$");
                                    }
                                }
                                if (quant == 0) {
                                    System.out.println("you are not a good client BYE waste of my GODDAMNED time");
                                    lol = 1;
                                }
                            }
                            if (choice == 1) {
                                System.out.println("the cost of the PHONE is = 500$");
                                System.out.println("indicate the quantity: ");
                                int quant = myInput.nextInt();
                                if (quant > 0) {
                                    int totalpriceofcell = quant * 500;
                                    String nameprod = "CELLPHONE";
                                    orders.add(new Order(quant, totalpriceofcell , nameprod));
                                    for (Order orders1 : orders) {
                                        System.out.println("the total price for "+orders1.getNameprod()+" order = " + orders1.getTotalpriceofcell() + "$");
                                    }
                                }
                                if (quant == 0) {
                                    System.out.println("you are not a good client BYE waste of my GODDAMNED time");
                                    lol = 1;
                                }
                            }
                            System.out.println("Do you wish to add another order?(1) for NO (0) for YES");
                            lol = myInput.nextInt();
                            if (lol != 0) {
                                lol = 1;
                            }
                        }
                        break;

                    case 2:
                        System.out.println("}-CART-{");

                        for (Client client : clients) {
                            System.out.println("Nome: " + client.getName());
                            System.out.println("Idade: " + client.getAge());
                            List<Order> orders2 = client.getOrders();
                            for (int y = 0; y < orders2.size(); y++) {
                                Order orders3 = orders2.get(y);
                                System.out.println("order: " + (y + 1) + ":");
                                System.out.println("  quantity: " + orders2.get(y).getQuant());
                                System.out.println("  total: " + orders2.get(y).getTotalpriceofcell());
                                System.out.println("  name of the product : "+orders2.get(y).getNameprod());
                            }
                            System.out.println("+------------------------------------------------------+");
                            System.out.println("THE TOTAL OF ORDERS = "+orders2.size());
                            System.out.println("+------------------------------------------------------+");
                            System.out.println("+------------------------------------------------------+");
                        }
                        break;
                    case 3:
                        System.out.println("seu pedido esta em andamento!...");
                        for (Client client : clients) {
                            System.out.println("Nome: " + client.getName());
                            System.out.println("Idade: " + client.getAge());
                            List<Order> orders2 = client.getOrders();
                            System.out.println("THE TOTAL OF ORDERS in process = " + orders2.size());
                        }
                        System.out.println("+-----------------------------------------------------------------------+");
                        Thread.sleep(10000);
                        System.out.println("");
                        System.out.println("YOUR ORDER HAS BEEN DELIVERED!");
                        for (Client client : clients) {
                            System.out.println("Nome: " + client.getName());
                            System.out.println("Idade: " + client.getAge());
                            List<Address> addresses1 = client.getAddresses();
                            for (int i = 0; i < addresses1.size(); i++) {
                                Address addresses2 = addresses1.get(i);
                                System.out.println("Endereço: " + (i + 1) + ":");
                                System.out.println("  Rua: " + addresses2.getStreet());
                                System.out.println("  Número: " + addresses2.getNumb());
                            }
                            List<Order> orders2 = client.getOrders();
                            for (int y = 0; y < orders2.size(); y++) {
                                Order orders3 = orders2.get(y);
                                System.out.println("order: " + (y + 1) + ":");
                                System.out.println("  quantity: " + orders2.get(y).getQuant());
                                System.out.println("  total: " + orders2.get(y).getTotalpriceofcell());
                                System.out.println("  name of the product : "+orders2.get(y).getNameprod());
                            }
                            System.out.println("+------------------------------------------------------+");
                            System.out.println("THE TOTAL OF ORDERS = "+orders2.size());
                            System.out.println("+------------------------------------------------------+");
                            System.out.println("+------------------------------------------------------+");
                        }
                        break;
                    case 4:
                        System.out.printf("Closing system...");
                        exit = true;
                        break;
                    default:
                        System.out.printf("Error");
                        break;
                }
            }


        }
        while (exit != true);


    }

}

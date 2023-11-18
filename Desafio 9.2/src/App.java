public class App {
    public static void main(String[] args) throws Exception {
        //Teste do Banco de Ophidian
        System.out.println("Teste do Banco de Ophidian");
        System.out.println("--------------------------");
        OphidianDB db = new OphidianDB();
        db.inserirCliente(new ClienteOphidian("João"));
        db.inserirCliente(new ClienteOphidian("Maria"));    
        db.inserirCliente(new ClienteOphidian("José"));
        db.inserirCliente(new ClienteOphidian("Pedro"));
        db.inserirCliente(new ClienteOphidian("Ana"));
        db.inserirCliente(new ClienteOphidian("Carlos"));
        db.inserirCliente(new ClienteOphidian("Mariana"));
        db.inserirCliente(new ClienteOphidian("Joaquim"));
        db.inserirCliente(new ClienteOphidian("Antônio"));

        db.processarfila();
        System.out.println("--------------------------");
        //Teste da BinaryCounter
        System.out.println("Teste do BinaryCounter");
        System.out.println("--------------------------");
        BinaryCounter bc = new BinaryCounter(8);
        bc.print();
    }
}

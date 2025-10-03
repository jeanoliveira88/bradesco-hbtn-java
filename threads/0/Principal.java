public class Principal {
    public static void main(String[] args) {
        Contador contador = new Contador();

        // Criando duas threads que compartilham o mesmo contador
        ThreadContador thread1 = new ThreadContador(contador);
        ThreadContador thread2 = new ThreadContador(contador);

        // Iniciando as threads
        thread1.start();
        thread2.start();

        // Aguardando ambas as threads terminarem
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimindo o valor final do contador
        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}

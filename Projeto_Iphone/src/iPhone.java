public class iPhone implements MusicPlayer, Phone, WebBrowser {

    // Implementação dos métodos da interface MusicPlayer
    @Override
    public void playMusic() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando música.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando música.");
    }

    // Implementação dos métodos da interface Phone
    @Override
    public void makeCall(String number) {
        System.out.println("Fazendo chamada para " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Terminando chamada.");
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo chamada.");
    }

    // Implementação dos métodos da interface WebBrowser
    @Override
    public void openBrowser() {
        System.out.println("Abrindo navegador.");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navegando para " + url);
    }

    @Override
    public void addTab(String url) {
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void closeTab() {
        System.out.println("Fechando aba.");
    }

    public static void main(String[] args) {
        iPhone myPhone = new iPhone();

        // Testando funções de reprodutor musical
        myPhone.playMusic();
        myPhone.pauseMusic();
        myPhone.stopMusic();

        // Testando funções de telefone
        myPhone.makeCall("123456789");
        myPhone.answerCall();
        myPhone.endCall();

        // Testando funções de navegador
        myPhone.openBrowser();
        myPhone.navigateTo("https://www.example.com");
        myPhone.addTab("https://www.anotherexample.com");
        myPhone.closeTab();
    }
}

public interface WebBrowser {
    void openBrowser();
    void navigateTo(String url);
    void addTab(String url);
    void closeTab();
}

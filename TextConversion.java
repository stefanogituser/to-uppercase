public class TextConversion {
    private Input input;

    // This is where we inject the dependency
    public TextConversion(final Input input){
        this.input = input;
    }

    public void showInputInUpperCase(){
        String inputText = input.fetch();

        // Convert
        String upperCaseText = inputText.toUpperCase();

        // Display
        System.out.println(upperCaseText);
    }
}

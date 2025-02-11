public class TextConversion {
    private Input input;
    private Output output;

    // This is where we inject the dependency
    public TextConversion(final Input input, final Output outpu){
        this.input = input;
        this.output = output;
    }

    public void showInputInUpperCase(){
        String inputText = input.fetch();

        // Convert
        String upperCaseText = inputText.toUpperCase();

        // Display
        output.display(upperCaseText);
    }
}

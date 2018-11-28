package sandbox;

import jsinterop.annotations.JsType;

@JsType
public class Main {
    public static int main() {
        return Library.sum(3, 4);
    }
}
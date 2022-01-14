// FILE: Mapper.java

public class Mapper {
    public <T> T readValue(Class<T> valueType) {
        return null;
    }
}

// FILE: BaseModel.java

public class BaseModel {
    public String getBar() { return ""; }

    public void setBar(String s) {}
}

// FILE: Test.kt

fun <T : BaseModel?> foo(cls: Class<T>?) {
    val mapper = Mapper()
    val result = mapper.readValue<T>(cls)!!
    result<!UNSAFE_CALL!>.<!>bar = "Omega"
}

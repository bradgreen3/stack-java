import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;

public class StackTest {

    Stack stack = new Stack();

    @Test
    public void isEmpty_returnsTrueWhenStackIsEmpty() {
        Boolean actual = stack.isEmpty();

        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void isEmpty_returnsFalseWhenStackIsNotEmpty() {
        stack.push("first");
        
        Boolean actual = stack.isEmpty();

        assertThat(actual).isEqualTo(false);
    }

    @Test
    public void peek_returnsObjectFromStackWhenOnlyOneObjectPresent() {
        Object expected = "first";

        stack.push(expected);

        Object actual = stack.peek();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void peek_returnsLastObjectFromStackWhenMoreThanOneObjectPresent() {
        Object expected = "second";

        stack.push("first");
        stack.push(expected);
    }

    @Test
    public void peek_returnsNullWhenStackIsEmpty() {
        assertNull(stack.peek());
    }

    @Test
    public void pop_removesLastObjectFromStackAndReturnsIt() {
        Object expected = "first";

        stack.push(expected);

        Object actual = stack.pop();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void pop_returnsNullWhenStackIsEmpty() {
        assertNull(stack.pop());
    }

    @Test
    public void size_returnsTotalNumberOfObjectsOnStack() {
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.pop();

        Integer actual = stack.size();
        assertThat(actual).isEqualTo(2);
    }
}
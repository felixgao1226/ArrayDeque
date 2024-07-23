import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class ArrayDeque61BTest {

    @Test
    void addFirstTestWithoutResize() {
        Deque61B<Integer> ad1 = new ArrayDeque61B<>();
        //add 3 items to the list
        ad1.addFirst(4);
        ad1.addFirst(3);
        ad1.addFirst(2);
        ad1.addFirst(1);
        ad1.addFirst(0);
        ad1.addFirst(7);
        ad1.addFirst(6);
        ad1.addFirst(5);
//        ad1.addFirst(15);
    }

    @Test
    void addLastTestWithoutResize() {
        Deque61B<Integer> ad1 = new ArrayDeque61B<>();
        ad1.addLast(5);
        ad1.addLast(6);
        ad1.addLast(7);
        ad1.addLast(0);
        ad1.addLast(1);
        ad1.addLast(2);
        ad1.addLast(3);
        ad1.addLast(4);
//        ad1.addLast(8);

    }

    @Test
    void getTestAddFirst() {
        Deque61B<Integer> ad1 = new ArrayDeque61B<>();
        //add first
        for (int i = 0; i < 8; i++) {
            ad1.addFirst(i);
            assertThat(ad1.get(i)).isEqualTo(8 - i);
        }
    }

    @Test
    void getTestAddLast() {
        Deque61B<Integer> ad1 = new ArrayDeque61B<>();
        //add last
        for (int i = 0; i < 8; i++) {
            ad1.addLast(i);
            assertThat(ad1.get(i)).isEqualTo(i);

        }
    }
}

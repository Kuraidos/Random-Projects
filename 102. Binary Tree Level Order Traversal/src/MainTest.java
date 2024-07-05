package src;



import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static src.Main.*;


class MainTest {
    @Test
    void shouldBeEmptyWhenInputIsNull(){
        TreeNode root = null;
        assertThat(levelOrder(root).size()).isZero();
    }

    @Test
    void shouldHave1ValueWhenOnlyRoot(){
        TreeNode root = new TreeNode(2);
        int expectedSize = 1;

        assertThat( levelOrder(root))
                .hasSize(expectedSize)
                .satisfiesExactly(firstElement -> assertThat(firstElement).contains(root.val));
    }

    @Test
    void shouldMatchTypicalCase(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int expectedSize = 3;

        assertThat(levelOrder(root))
                .hasSize(expectedSize)
                .satisfiesExactly(firstElement -> assertThat(firstElement).contains(root.val),
                        secondElement -> assertThat(secondElement).contains(root.left.val).contains(root.right.val),
                        thirdElement -> assertThat(thirdElement).contains(root.right.left.val).contains(root.right.right.val));
    }

}
package kardo.designpatterns.factory;

import org.springframework.stereotype.Component;
import kardo.designpatterns.model.Board;

@Component
public class PrivateBoardFactory {
    public Board createBoard(String name, String ownerId) {
        Board board = new Board();
        board.setName(name);
        board.setOwnerId(ownerId);
        //board.setPrivate(true); // ✅ This is the crucial part
        return board;
    }
}

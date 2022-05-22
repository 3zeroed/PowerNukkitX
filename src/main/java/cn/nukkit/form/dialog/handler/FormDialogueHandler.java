package cn.nukkit.form.dialog.handler;

import cn.nukkit.Player;
import cn.nukkit.form.dialog.response.FormResponseDialogue;

import java.util.function.Consumer;

public interface FormDialogueHandler {

    static FormDialogueHandler withoutPlayer(Consumer<FormResponseDialogue> responseConsumer) {
        return (player, response) -> responseConsumer.accept(response);
    }

    void handle(Player player, FormResponseDialogue response);
}

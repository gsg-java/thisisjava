package gs3.nekisse.machine.abstracts.machine_interface.impl;

import gs3.nekisse.machine.abstracts.machine_interface.Volumecontrol;

/**
 * Created by Nekisse_lee on 2017. 7. 6..
 */
public class Speaker implements Volumecontrol {
    @Override
    public void volumeUp() {
        System.out.println("  볼륨을 높입니다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("  볼륨을 낮춥니다.");

    }
}

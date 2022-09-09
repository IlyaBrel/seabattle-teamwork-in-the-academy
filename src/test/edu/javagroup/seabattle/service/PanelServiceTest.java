package edu.javagroup.seabattle.service;

import edu.javagroup.seabattle.common.utils.CommonService;
import edu.javagroup.seabattle.constants.Constants;
import edu.javagroup.seabattle.service.impl.PanelServiceImpl;
import edu.javagroup.seabattle.singleton.EnemyPanelSingleton;
import edu.javagroup.seabattle.singleton.MinePanelSingleton;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * перед использованием раскомментировать классы
 * <p>
 * test -> edu.javagroup.seabattle.common.utils.CommonPanelService
 * test -> edu.javagroup.seabattle.common.utils.impl.CommonPanelServiceImpl
 *
 * @author kaa
 * @version 1.4
 */
@SpringBootTest
public class PanelServiceTest {

    @Autowired
    private PanelService panelService;

    @Autowired
    private CommonService commonService;

    //------------------------------------------------------------------------------------------------------------------

    @Test
    void oopTest() {
        // проверки использования парадигм
        assertThat(PanelServiceImpl.class.getInterfaces()[0].getName().equals(PanelService.class.getName())).isTrue();
    }

    @Test
    void isPanelEmptyTest() {
        MinePanelSingleton.instance(commonService.getPanel00());
        assertThat(panelService.isPanelEmpty()).isTrue();

        MinePanelSingleton.instance(commonService.getPanel19());
        assertThat(panelService.isPanelEmpty()).isFalse();
    }

    @Test
    void isFullMinePanelTest() {
        MinePanelSingleton.instance(commonService.getPanel19());
        assertThat(panelService.isFullMinePanel()).isFalse();

        MinePanelSingleton.instance(commonService.getPanel20());
        assertThat(panelService.isFullMinePanel()).isTrue();
    }

    @Test
    void checkEndGameTest() {
        MinePanelSingleton.instance(commonService.getPanel20());
        assertThat(panelService.checkEndGame(Constants.MINE)).isFalse();

        MinePanelSingleton.instance(commonService.getPanel22());
        assertThat(panelService.checkEndGame(Constants.MINE)).isTrue();

        EnemyPanelSingleton.instance(commonService.getPanel20());
        assertThat(panelService.checkEndGame(Constants.ENEMY)).isFalse();

        EnemyPanelSingleton.instance(commonService.getPanel22());
        assertThat(panelService.checkEndGame(Constants.ENEMY)).isTrue();
    }
}

package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {

    private int x = 0, y = 0;

    public CommandSetPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public void execute(IPlotter iPlotter) {
        iPlotter.setPosition(x, y);

    }

}

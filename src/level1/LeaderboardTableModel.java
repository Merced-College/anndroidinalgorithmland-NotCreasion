package level1;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class LeaderboardTableModel extends AbstractTableModel {
    private final String[] cols = {"Rank", "Username", "Score", "Hits", "Misses", "When", "Level"};
    private List<ScoreEntry> data = new ArrayList<>();

    public void setData(List<ScoreEntry> newData) {
        this.data = newData;
        fireTableDataChanged();
    }

    @Override public int getRowCount() { return data.size(); }
    @Override public int getColumnCount() { return cols.length; }
    @Override public String getColumnName(int column) { return cols[column]; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ScoreEntry entry = data.get(rowIndex);
         switch (columnIndex) {

            case 0:
                return entry.rowIndex + 1;
            case 1:
                return entry.getUsername();
            case 2:
             return entry.getScore();
            case 3:
                 return entry.getHits();
            case 4:
                 return entry.getMisses();
            case 5:
                 return entry.getTimestampISO();
            case 6:
                 return entry.getLevel();
            default:
                return null;
        }
    }
}

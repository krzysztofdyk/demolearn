package msOffice.excelPoiji;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

import javax.persistence.Entity;

@Entity
public class InvoiceExcel {

    @ExcelRow
    private int rowIndex;

    @ExcelCellName("Name")
    private String name;

    @ExcelCellName("Amount")
    private Double amount;

    @ExcelCellName("Number")
    private String number;

    @ExcelCellName("RecievedDate")
    private String receivedDate;

    @Override
    public String toString() {
        return "InvoiceExcel [rowIndex=" + rowIndex + ", name=" + name + ", amount=" + amount + ", number=" + number
                + ", receivedDate=" + receivedDate + "]";
    }

}

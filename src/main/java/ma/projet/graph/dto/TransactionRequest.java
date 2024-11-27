package ma.projet.graph.dto;

import lombok.Data;
import java.util.Date;
import ma.projet.graph.entities.TypeTransaction;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private Date date;
    private TypeTransaction type;
}

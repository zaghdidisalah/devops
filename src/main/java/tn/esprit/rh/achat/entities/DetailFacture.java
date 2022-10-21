package tn.esprit.rh.achat.entities;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFacture;
	private Integer qteCommandee;
	private float prixTotalDetail;
	private Integer pourcentageRemise;
	private float montantRemise;
	@ManyToOne
	private Produit produit;
	@ManyToOne
	@JsonIgnore
	Facture facture;

}

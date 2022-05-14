package psi.model.repository;

import psi.metamodel.AbstractRepository;
import psi.Entities.Document;

public class documentRepository extends AbstractRepository {

	
	public Document saveDocument(Document document) {
		if (document.getId()==null)
			document=(Document)this.create(document);
		else 
			document=(Document)this.update(document);
		
		return document;
	}


}

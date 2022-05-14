CREATE TABLE Document (id BIGINT NOT NULL, CODDOCUMENT VARCHAR(255), CREATEDBYUSER VARCHAR(255), DATADOCUMENT DATE, DATAOPERARE TIMESTAMP, dateCreated TIMESTAMP NOT NULL, dateUpdated TIMESTAMP NOT NULL, ENTITY_TYPE VARCHAR(255), NUMEDOCUMENT VARCHAR(255), TIPDOCUMENT VARCHAR(255), UPDATEDBYUSER VARCHAR(255), version INTEGER, PRIMARY KEY (id))
CREATE TABLE GESTIUNE (id BIGINT NOT NULL, CODGESTIUNE INTEGER, CREATEDBYUSER VARCHAR(255), dateCreated TIMESTAMP NOT NULL, dateUpdated TIMESTAMP NOT NULL, DENUMIREGESTIUNE VARCHAR(255), ENTITY_TYPE VARCHAR(255), NUMEGESTIONAR VARCHAR(255), UPDATEDBYUSER VARCHAR(255), version INTEGER, PRIMARY KEY (id))
CREATE TABLE LinieDocument (id BIGINT NOT NULL, CANTITATE FLOAT, CREATEDBYUSER VARCHAR(255), dateCreated TIMESTAMP NOT NULL, dateUpdated TIMESTAMP NOT NULL, ENTITY_TYPE VARCHAR(255), UPDATEDBYUSER VARCHAR(255), VALOAREINVENTAR FLOAT, version INTEGER, DOCUMENT_id BIGINT, MIJLOCFIX_id BIGINT, PRIMARY KEY (id))
CREATE TABLE MIJLOCFIX (id BIGINT NOT NULL, NRDMIJLOCFIX VARCHAR(255), CARACTTEHNICE VARCHAR(255), CREATEDBYUSER VARCHAR(255), DATAAMORTIZARECOMPLETA TIMESTAMP, DATAFOLOSINTA TIMESTAMP, dateCreated TIMESTAMP NOT NULL, dateUpdated TIMESTAMP NOT NULL, DENUMIREMIJLOC VARCHAR(255), DURATANORMALAFUNCTIONARE VARCHAR(255), ENTITY_TYPE VARCHAR(255), FOLOSINTA BOOLEAN, GESTIONAR VARCHAR(255), TIPAMORTIZARE VARCHAR(255), UM VARCHAR(255), UPDATEDBYUSER VARCHAR(255), VALOAREAMORTIZARE FLOAT, VALOAREMIJLOCFIX FLOAT, VALOAREARAMASA FLOAT, version INTEGER, PRIMARY KEY (id))
CREATE TABLE Transfer (id BIGINT NOT NULL, CREATEDBYUSER VARCHAR(255), dateCreated TIMESTAMP NOT NULL, dateUpdated TIMESTAMP NOT NULL, ENTITY_TYPE VARCHAR(255), UPDATEDBYUSER VARCHAR(255), version INTEGER, GESTIUNEDESTINATIE_id BIGINT, GESTIUNESURSA_id BIGINT, PRIMARY KEY (id))
ALTER TABLE LinieDocument ADD CONSTRAINT FK_LinieDocument_MIJLOCFIX_id FOREIGN KEY (MIJLOCFIX_id) REFERENCES MIJLOCFIX (id)
ALTER TABLE LinieDocument ADD CONSTRAINT FK_LinieDocument_DOCUMENT_id FOREIGN KEY (DOCUMENT_id) REFERENCES Document (id)
ALTER TABLE Transfer ADD CONSTRAINT FK_Transfer_GESTIUNESURSA_id FOREIGN KEY (GESTIUNESURSA_id) REFERENCES GESTIUNE (id)
ALTER TABLE Transfer ADD CONSTRAINT FK_Transfer_GESTIUNEDESTINATIE_id FOREIGN KEY (GESTIUNEDESTINATIE_id) REFERENCES GESTIUNE (id)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
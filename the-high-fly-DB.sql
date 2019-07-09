--------------------------------------------------------
--  File creato - marted�-luglio-09-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CLIENTE
--------------------------------------------------------

  CREATE TABLE "SYS"."CLIENTE" 
   (	"ID_CLIENTE" NUMBER, 
	"PRIVATO" NUMBER(*,0), 
	"USERNAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table BOOKING
--------------------------------------------------------

  CREATE TABLE "SYS"."BOOKING" 
   (	"ID_PRENOTAZIONE" VARCHAR2(50 BYTE), 
	"ID_CLIENTE" NUMBER, 
	"ID_VEICOLO" NUMBER, 
	"NOME" VARCHAR2(20 BYTE), 
	"COGNOME" VARCHAR2(20 BYTE), 
	"NUM_PARTECIPANTI" NUMBER, 
	"PREZZO_TOTALE" FLOAT(126), 
	"DATA_INIZIO" DATE, 
	"DATA_FINE" DATE, 
	"LUOGO_PARTENZA" VARCHAR2(20 BYTE), 
	"LUOGO_ARRIVO" VARCHAR2(20 BYTE), 
	"STATO" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table VEICOLO
--------------------------------------------------------

  CREATE TABLE "SYS"."VEICOLO" 
   (	"ID_VEICOLO" NUMBER, 
	"NUM_POSTI_DISPONIBILI" NUMBER, 
	"PREZZO" FLOAT(126), 
	"TIPO" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYS.CLIENTE
SET DEFINE OFF;
REM INSERTING into SYS.BOOKING
SET DEFINE OFF;
REM INSERTING into SYS.VEICOLO
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index CLIENTE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS"."CLIENTE_PK" ON "SYS"."CLIENTE" ("ID_CLIENTE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index CLIENTE_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS"."CLIENTE_UK1" ON "SYS"."CLIENTE" ("USERNAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PRENOTAZIONE_PRIVATO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS"."PRENOTAZIONE_PRIVATO_PK" ON "SYS"."BOOKING" ("ID_PRENOTAZIONE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index VEICOLO_PRIVATO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS"."VEICOLO_PRIVATO_PK" ON "SYS"."VEICOLO" ("ID_VEICOLO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table CLIENTE
--------------------------------------------------------

  ALTER TABLE "SYS"."CLIENTE" ADD CONSTRAINT "CLIENTE_UK1" UNIQUE ("USERNAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYS"."CLIENTE" ADD CONSTRAINT "CLIENTE_PK" PRIMARY KEY ("ID_CLIENTE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYS"."CLIENTE" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "SYS"."CLIENTE" MODIFY ("USERNAME" NOT NULL ENABLE);
  ALTER TABLE "SYS"."CLIENTE" MODIFY ("PRIVATO" NOT NULL ENABLE);
  ALTER TABLE "SYS"."CLIENTE" MODIFY ("ID_CLIENTE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BOOKING
--------------------------------------------------------

  ALTER TABLE "SYS"."BOOKING" ADD CONSTRAINT "BOOKING_PK" PRIMARY KEY ("ID_PRENOTAZIONE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYS"."BOOKING" MODIFY ("LUOGO_PARTENZA" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("DATA_FINE" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("DATA_INIZIO" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("PREZZO_TOTALE" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("NUM_PARTECIPANTI" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("COGNOME" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("NOME" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("ID_VEICOLO" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("ID_CLIENTE" NOT NULL ENABLE);
  ALTER TABLE "SYS"."BOOKING" MODIFY ("ID_PRENOTAZIONE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table VEICOLO
--------------------------------------------------------

  ALTER TABLE "SYS"."VEICOLO" ADD CONSTRAINT "VEICOLO_PK" PRIMARY KEY ("ID_VEICOLO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYS"."VEICOLO" MODIFY ("TIPO" NOT NULL ENABLE);
  ALTER TABLE "SYS"."VEICOLO" MODIFY ("PREZZO" NOT NULL ENABLE);
  ALTER TABLE "SYS"."VEICOLO" MODIFY ("NUM_POSTI_DISPONIBILI" NOT NULL ENABLE);
  ALTER TABLE "SYS"."VEICOLO" MODIFY ("ID_VEICOLO" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table BOOKING
--------------------------------------------------------

  ALTER TABLE "SYS"."BOOKING" ADD CONSTRAINT "BOOKING_FK1" FOREIGN KEY ("ID_VEICOLO")
	  REFERENCES "SYS"."VEICOLO" ("ID_VEICOLO") ENABLE;
  ALTER TABLE "SYS"."BOOKING" ADD CONSTRAINT "BOOKING_FK2" FOREIGN KEY ("ID_CLIENTE")
	  REFERENCES "SYS"."CLIENTE" ("ID_CLIENTE") ENABLE;
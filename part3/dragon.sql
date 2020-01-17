

CREATE TABLE dragon(
       dragon_id INTEGER,
       dragon_name VARCHAR(100),
       birth_date DATE NOT NULL,
       wizard_id BIGINT FOREIGN KEY REFERENCES wizard(wizard_id),
       PRIMARY KEY (dragon_id)
      );

CREATE TABLE wizard(
       wizard_id INTEGER,
       wizard_name VARCHAR(100)
      );


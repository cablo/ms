CREATE TABLE public."team" (
   id SERIAL PRIMARY KEY,
   "name" text NOT NULL,
   "location" text NOT NULL
);
INSERT INTO public."team" ("name", location) VALUES('Red Team', 'Prague');
INSERT INTO public."team" ("name", location) VALUES('Green Team', 'Brno');
INSERT INTO public."team" ("name", location) VALUES('Blue Team', 'Ostrava');


CREATE TABLE public."player" (
   id SERIAL PRIMARY KEY,
   "team_id" integer NOT NULL REFERENCES public."team",
   "name" text NOT NULL,
   "birth_year" integer NOT NULL
);
INSERT INTO public.player (team_id, name, birth_year) VALUES(1, 'John Doe', 1990);
INSERT INTO public.player (team_id, name, birth_year) VALUES(1, 'James Smith', 1995);
INSERT INTO public.player (team_id, name, birth_year) VALUES(1, 'Mary Johnson', 1995);
INSERT INTO public.player (team_id, name, birth_year) VALUES(1, 'John Williams', 2000);
INSERT INTO public.player (team_id, name, birth_year) VALUES(2, 'Patricia Brown', 2005);
INSERT INTO public.player (team_id, name, birth_year) VALUES(2, 'Robert Jones', 2010);

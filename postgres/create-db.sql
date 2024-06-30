CREATE TABLE public."user" (
   id SERIAL PRIMARY KEY,
   "name" text NOT NULL,
   "address" text NOT NULL
);
INSERT INTO public."user" ("name", address) VALUES('Karel Cabel', 'Podolska');
INSERT INTO public."user" ("name", address) VALUES('Jan Novak', 'Praha');
INSERT INTO public."user" ("name", address) VALUES('John Doe', 'Nowhere');


CREATE TABLE public."car" (
   id SERIAL PRIMARY KEY,
   "user_id" integer NOT NULL REFERENCES public."user",
   "make" text NOT NULL,
   "model" text NOT NULL,
   "year" integer NOT NULL
);
INSERT INTO public.car (user_id, make, model, year) VALUES(1, 'Skoda', 'Octavia', 2005);
INSERT INTO public.car (user_id, make, model, year) VALUES(1, 'Volkswagen', 'Passat', 2010);
INSERT INTO public.car (user_id, make, model, year) VALUES(1, 'Kia', 'Ceed', 2015);
INSERT INTO public.car (user_id, make, model, year) VALUES(2, 'Toyota', 'Corolla', 2000);

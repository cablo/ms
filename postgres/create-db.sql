CREATE TABLE public."user" (
   id SERIAL PRIMARY KEY,
   "name" text NOT NULL,
   "address" text NOT NULL
);
INSERT INTO public."user" ("name", address) VALUES('cablo', 'podolska');
INSERT INTO public."user" ("name", address) VALUES('novak', 'praha');



CREATE TABLE public."book" (
   id SERIAL PRIMARY KEY,
   "user_id" integer NOT NULL REFERENCES public."user",
   "name" text NOT NULL,
   "author" text NOT NULL
);
INSERT INTO public.book (user_id, "name", author) VALUES(1, 'Tma', 'Neff');
INSERT INTO public.book (user_id, "name", author) VALUES(1, 'Tma 2.0', 'Neff');
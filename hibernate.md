# Key Concepts

## Framework

- **Framework**: Reduces boilerplate code and simplifies development.

### ORM

- **ORM**: Object Relational Mapping, bridges objects and relational databases.

### Java vs SQL

- **Java**: Object-Oriented Programming language.
- **SQL**: Manages data in tables.

### Mapping Objects to Tables

- **Object**: Maps to database tables.

**Example SQL Query:**

```sql
SELECT * FROM user;
```

- **Table**: `user`
- **Columns**: `id`, `name`, `email`

**Corresponding Java Class:**

```java
public class User {
    int id;
    String name;
    String email;
}
```

## Steps in Hibernate

- **SessionFactory**: Creates sessions to interact with the database.

1. Create configuration.
2. Configure `hibernate.cfg.xml`.
3. Add annotated class.
4. Create SessionFactory.
5. Get Session.
6. Create an object.
7. Begin transaction using Session.
8. Use `persist()` to save data.
9. Commit data using `getTransaction().commit()`.

## Methods in Hibernate

1. **Insert**: `persist(object);`
2. **Update**: `merge(object);`
3. **Delete**: `remove(object);`

### Dirty Checking

- Applies to updates only.
- When data is loaded from the database, small changes are automatically updated without calling `merge()`.

## States in Hibernate

There are three states:

1. **Transient**: Object not associated with any session.
2. **Persistent**: Object associated with a session.
   - Examples: `session.persist(emp)`, `session.find()`.
   - _Note_: Persistent state objects are subject to dirty checking.
3. **Detached**: Object becomes detached when the session is closed.

### @GeneratedValue

- Does not generate new values; it retrieves auto-incremented values from SQL to Java (reverse binding).

## Querying in Hibernate

### find()

- **DQL**: Represents SELECT queries.

### HQL (Hibernate Query Language)

**Example SQL:**

```sql
SELECT * FROM students;
```

**Equivalent HQL:**

```sql
SELECT s FROM Student s;
```

### Query Types

- **DQL**: `createSelectionQuery();` for SELECT operations.
- **DML**: `createMutationQuery();` for Insert, Update, Delete operations.

### NativeQuery

- **SQL Query**: Uses original SQL syntax.
- **DML**: `session.createNativeMutationQuery()`.
- **DQL**: `session.createNativeQuery()`.

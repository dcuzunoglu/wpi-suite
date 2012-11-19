package edu.wpi.cs.wpisuitetng.modules.core.entitymanagers;

import java.util.ArrayList;

/**
 * Interface for all EntityManagers. Enforces standards for interaction
 * 	with the Model class T.
 * @author twack
 *
 * @param <T>	The Model Class
 * @param <C>	The Datatype of this Model's unique identifier
 */
public interface EntityManager<T, C>
{
	/* Create (Entity Builder) */
	/**
	 * Defines Model-specific instantiation
	 * @return	an instance of this Manager's Model class T
	 */
	public T makeEntity();
	
	/* Retrieve */	
	/**
	 * Retrieves the entity with the given unique identifier, id.
	 * @param id	the unique identifier value
	 * @return	the entity with the given ID
	 */
	public T getEntity(C id);
	
	/**
	 * Retrieves all entities of Model class T
	 * @return	an ArrayList<T> with all instances of T
	 */
	public ArrayList<T> getAll();
	
	
	/* Update */
	/**
	 * Saves the given model of class T to the database
	 * @param model	the Model to update.
	 */
	public void save(T model);
	
	/* Delete */
	/**
	 * Deletes the entity with the given unique identifier, id.
	 * @param id	the unique identifier for the entity
	 */
	public void deleteEntity(C id);
	
	/**
	 * Deletes all entities of Model class T
	 */
	public void deleteAll();
	
	/* Utility Methods */
	/**
	 * 
	 * @return	the number of records of this Manager's Model class T
	 */
	public int Count();
}
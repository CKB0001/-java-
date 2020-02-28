import java.util.*;
public class MovieStore {
	private Hashtable<String,Movie>movieList;
	private Hashtable<String,Vector<Movie>>actorList;
	private Hashtable<String,Vector<Movie>>typeList;
	public Hashtable<String,Movie>getMovieList()
	{
		return movieList;
	}
	public Hashtable <String,Vector<Movie>>actorList()
	{
		return actorList;
	}
	public Hashtable <String ,Vector<Movie>>typeList()
	{
		return typeList;
	}
	public MovieStore()
	{
		movieList=new Hashtable <String,Movie>();
		actorList=new Hashtable <String,Vector<Movie>>();
		typeList=new Hashtable <String,Vector<Movie>>();
	}
	@Override
	public String toString()
	{
		return ("MovieStore with "+movieList.size()+"movies.");
	}
	public void listMovies()//�������Movie����ı���
	{
		Enumeration<String>titles=movieList.keys();
		while(titles.hasMoreElements())
		{
			System.out .println(titles.nextElement());
		}
	}
	public void listMoviesWithActor(String anActor) //���������Ա�μӵ����е�Ӱ
	{
		Iterator<Movie>someMovies=actorList.get(anActor).iterator();
		while(someMovies.hasNext()) 
		{
			System.out .println(someMovies.next());
		}
	}
	public void listMoviesOftype(String aType)
	{
		Vector<Movie>someMovies=typeList.get(aType);
		for(Movie m:someMovies)
		{
			System.out .println(m);
		}
	}
	public void addMovie(Movie aMovie) //����һ��Movie����
	{
		movieList.put(aMovie.getTitle(),aMovie);
		if(!typeList.containsKey(aMovie.getType()))
		{
			typeList.put(aMovie.getType(),new Vector<Movie>());
		}
		typeList.get(aMovie.getType()).add(aMovie);
		for(String anActor:aMovie.getActors())
		{
			if(!actorList.containsKey(anActor)) 
			{
				actorList.put(anActor,new Vector<Movie>());
			}
			actorList.get(anActor).add(aMovie);
		}
	}
	private void removeMovie(Movie aMovie)//��MovieStore��ɾ��һ��Movie����
	{
		movieList.remove(aMovie.getTitle());
		typeList.get(aMovie.getType()).remove(aMovie);
		if(typeList.get(aMovie.getType()).isEmpty())
		{
			typeList.remove(aMovie.getType());
		}
		for (String anActor:aMovie.getActors())
		{
			actorList.get(anActor).removeElement(aMovie);
			if(actorList.get(anActor).isEmpty())
			{
				actorList.remove(anActor);
			}
		}
	}
	public void removeMovie(String aTitle) 
	{
		if(movieList.get(aTitle)==null)
		{
			System.out .println("No movie with that title");
		}
		else 
		{
			removeMovie(movieList.get(aTitle));
		}
	}
}

package tree;

import java.util.ArrayList;
import java.util.List;

import Lists.Positional.Position;

public abstract class AbstractTree<E> implements Tree<E> {
	public boolean isInternal(Position<E> p) throws IllegalArgumentException {
		return numChildren(p) > 0;
	}
	public boolean isExternal(Position<E> p) throws IllegalArgumentException {
		return numChildren(p) == 0;
	}
	public boolean isRoot(Position<E> p) throws IllegalArgumentException{
		return p == root();
	}
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int depth(Position<E> p) {
		if(isRoot(p)) {
			return 0;
		}else {
			return 1 + depth(parent(p));
		}
	}
	
	public int height(Position<E> p) {
		int h = 0;
		
		for(Position<E> c : children(p)) {
			h = Math.max(h, 1 + height(c));
		}
		
		return h;
	}
	
	/**
     * Adds positions of the subtree rooted at position to the given snapshot.
     * 
     * @param position
     * @param snapshot
     */
    private void preOrderSubtree(Position<E> position, List<Position<E>> snapshot) {
        snapshot.add(position);         // for preorder, we add position before exploring subtrees
        
        for (Position<E> child : children(position)) {
            preOrderSubtree(child, snapshot);
        }
    }
    

    /**
     * Returns an iterable collection of positions of the tree, reported in preorder.
     * 
     * @return 
     */
    public Iterable<Position<E>> preOrder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {
            preOrderSubtree(root(), snapshot);
        }
        
        return snapshot;
    }
    
    /**
     * Adds positions of the subtree rooted at Position p to the given snapshot.
     * @param position
     * @param snapshot 
     */
    private void postOrderSubtree(Position<E> position, List<Position<E>> snapshot) {
        for (Position<E> child : children(position)) {
            postOrderSubtree(child, snapshot);
        }
        
        snapshot.add(position);         // for preorder, we add position before exploring subtrees
    }
    
    public Iterable<Position<E>> postOrder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {
            postOrderSubtree(root(), snapshot);
        }
        
        return snapshot;
    }
}

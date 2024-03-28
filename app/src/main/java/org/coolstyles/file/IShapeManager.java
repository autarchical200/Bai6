package org.coolstyles.file;

import org.coolstyles.file.model.Shape;

public interface IShapeManager {
    public void add(Shape shape);
        public void remove(Shape shape);
        public void sort();
        public Shape findMax();

}
